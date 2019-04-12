package com.thinkinglogic.example

import com.thinkinglogic.builder.annotation.BuilderInterface
import org.junit.jupiter.api.Test
import kotlin.reflect.full.isSubclassOf

internal class InterfaceTest {

    @Test
    fun `builder should extend the BuilderInterface interface`() {

        val builderWithInterface = SimpleDataWithInterfaceClassBuilder()

        assert(builderWithInterface::class.isSubclassOf(BuilderInterface::class))


        val builderWithoutInterface = SimpleDataClassBuilder()

        assert(!builderWithoutInterface::class.isSubclassOf(BuilderInterface::class))

    }
}