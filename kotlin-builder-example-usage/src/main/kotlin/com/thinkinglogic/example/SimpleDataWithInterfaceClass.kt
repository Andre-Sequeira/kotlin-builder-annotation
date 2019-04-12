package com.thinkinglogic.example

import com.thinkinglogic.builder.annotation.Builder
import com.thinkinglogic.builder.annotation.DefaultValue
import java.time.LocalDate

@Builder(true)
data class SimpleDataWithInterfaceClass(
        val notNullString: String,
        val nullableString: String?,
        val notNullLong: Long,
        val nullableLong: Long?,
        val date: LocalDate,
        @DefaultValue("withDefaultValue") val stringWithDefault: String = "withDefaultValue",
        @DefaultValue("LocalDate.MIN") val defaultDate: LocalDate = LocalDate.MIN
) {

    /**
     * @return a Builder initialised with fields from this object.
     */
    fun toBuilder() = SimpleDataWithInterfaceClassBuilder(this)

    companion object {
        @JvmStatic
        fun builder() = SimpleDataWithInterfaceClassBuilder()
    }
}