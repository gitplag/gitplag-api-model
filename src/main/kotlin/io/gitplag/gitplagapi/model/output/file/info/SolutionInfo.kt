package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import java.time.LocalDateTime

data class SolutionInfo(
    @JsonProperty(value = "student", required = true)
    val student: String,
    @JsonProperty(value = "updated", required = true)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    val updated: LocalDateTime,
    @JsonProperty(value = "files", required = true)
    val files: Collection<FileInfo>
)