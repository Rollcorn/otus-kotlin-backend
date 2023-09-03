package org.ok.shkandiuk.financyapp.exception

import org.ok.shkandiuk.financyapp.models.FinanceCommand

class UnknownFinanceCommand(command: FinanceCommand) : RuntimeException("Command $command cannot be mapped at toTransportStage")
