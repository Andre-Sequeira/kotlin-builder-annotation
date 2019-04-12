package com.thinkinglogic.builder.annotation

interface BuilderInterface<T> {

    fun build(): T
}