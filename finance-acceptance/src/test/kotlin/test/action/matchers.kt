package ru.otus.otuskotlin.financyapp.blackbox.test.action

import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult


val haveNoErrors = Matcher<String> {
    MatcherResult(
        it.contains("""{"result":"SUCCESS"}"""),
        { "result should be success" },
        { "result should not be success" }
    )
}
