package test

import io.kotest.core.spec.style.FunSpec
import ru.otus.otuskotlin.financyapp.blackbox.fixture.client.Client
import ru.otus.otuskotlin.financyapp.blackbox.test.action.createAd

fun FunSpec.testApiV1(client: Client) {
    context("v1") {
        test("Create Transaction") {
            client.createAd()
        }
    }
}