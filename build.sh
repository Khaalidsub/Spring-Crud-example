#!/bin/bash

mvnw package && java -jar target/pharma-spring-boot-docker-0.1.0.jar
docker compose up -d --build