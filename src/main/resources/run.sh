#!/bin/sh

echo "********************************************************"
echo "waiting for the database server to start on port $DATABASESERVER_PORT"
echo "********************************************************"
while ! `nc -z auth-database $DATABASESERVER_PORT`; do sleep 3; done
echo ">>>>>>>>>>>> Database Server has started"

echo "*******************************************"
echo "run authorization server"
echo $RUN_MESSAGE
echo "*******************************************"
java -jar app.jar