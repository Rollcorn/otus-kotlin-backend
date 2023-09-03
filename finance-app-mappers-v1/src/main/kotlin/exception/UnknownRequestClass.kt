package org.ok.shkandiuk.financyapp.exception

class UnknownRequestClass(clazz: Class<*>) : RuntimeException("Class $clazz cannot be mapped to FinancyContext")
