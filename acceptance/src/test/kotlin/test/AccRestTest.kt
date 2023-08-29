package test

import io.kotest.core.annotation.Ignored
import ru.otus.otuskotlin.financyapp.blackbox.docker.WiremockDockerCompose
import ru.otus.otuskotlin.financyapp.blackbox.fixture.BaseFunSpec
import ru.otus.otuskotlin.financyapp.blackbox.fixture.client.RestClient
import ru.otus.otuskotlin.financyapp.blackbox.fixture.docker.DockerCompose

@Ignored
open class AccRestTestBase(dockerCompose: DockerCompose) : BaseFunSpec(dockerCompose, {
    val client = RestClient(dockerCompose)

    testApiV1(client)
})
class AccRestWiremockTest : AccRestTestBase(WiremockDockerCompose)
// TODO class AccRestSpringTest : AccRestTestBase(SpringDockerCompose)
// TODO class AccRestKtorTest : AccRestTestBase(KtorDockerCompose)
