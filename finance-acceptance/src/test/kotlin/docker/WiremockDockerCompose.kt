package ru.otus.otuskotlin.financyapp.blackbox.docker

import ru.otus.otuskotlin.financyapp.blackbox.fixture.docker.AbstractDockerCompose

object WiremockDockerCompose : AbstractDockerCompose(
    "app-wiremock", 8080, "wiremock/docker-compose-wiremock.yml"
)