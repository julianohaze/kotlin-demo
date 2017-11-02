#!/usr/bin/env bash
docker rm -f kotlin-db
docker build -t kotlin-db .
docker run  -idt --name kotlin-db -e POSTGRES_PASSWORD=root -p 5432:5432 -d kotlin-db