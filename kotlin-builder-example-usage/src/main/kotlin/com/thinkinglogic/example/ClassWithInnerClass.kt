package com.thinkinglogic.example

import com.thinkinglogic.builder.annotation.Builder

@Builder
data class ClassWithInnerClass(
        val aString : String,
        val innerClass: InnerClass
) {

    @Builder
    data class InnerClass(
            val b : String
    )
}