package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class FileInfo(
    @JsonProperty(value = "id", required = true)
    val id: Long,
    @JsonProperty(value = "name", required = true)
    val name: String
)