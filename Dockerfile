FROM jboss/wildfly
ADD test-0.0.1-SNAPSHOT.war /opt/wildfly/standalone/deployments/
