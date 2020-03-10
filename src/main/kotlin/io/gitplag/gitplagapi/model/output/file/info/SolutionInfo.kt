package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
data class SolutionInfo(
    @JsonProperty(value = "student", required = true)
    val student: String,
    @JsonProperty(value = "updated", required = true)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    val updated: LocalDateTime,
    @JsonProperty(value = "files", required = true)
    val files: Collection<FileInfo>
)