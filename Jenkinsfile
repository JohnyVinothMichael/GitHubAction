pipeline {
    agent { label 'worker1' }

    environment {
        // args for the JVM
        MAVEN_OPTS = '-Xms512m -Xmx2048m -Xss5m'
        // our additional args for all mvn calls
        // we cannot run this projects' tests in AWS, so we skip them
        // and as long as Bamboo builds still take place, we cannot modify the
        // distributionManagement in pom.xml, so we specify an altDeploymentRepository
        mvn_args = '--batch-mode --no-transfer-progress -DskipTests -DaltDeploymentRepository=releases::default::https://nexus.infra.unzer.io/repository/maven-payment-processing'
    }

    stages {
        stage ('Build branch') {
            when {
                not { branch 'master' }
            }
            steps ('Build') {
                configFileProvider([configFile(fileId: 'payment-processing-maven-settings', variable: 'settings_xml')]) {
                    sh """
                        branch=\$(git status --porcelain -b | grep "##" | cut -f 2 -d ' ' | cut -f 1-2 -d - | tr '[:upper:]' '[:lower:]' | tr '/' '-')
                        if [ "\$branch" = "develop" ] ; then
                            changelist=".develop-SNAPSHOT"
                        else
                            changelist=".br-\$branch-SNAPSHOT"
                        fi
                        mvn \$mvn_args -D changelist="\$changelist" -s $settings_xml clean deploy
                    """
                }
            }
        }
        stage ('Build master') {
            when {
                branch 'master'
            }
            steps ('Build') {
                configFileProvider([configFile(fileId: 'payment-processing-maven-settings', variable: 'settings_xml')]) {
                    sh """#!/usr/bin/env bash
                        set +e
                        set -x
                        mvn \$mvn_args -s $settings_xml clean deploy
                    """
                }
            }
        }
    }
}
