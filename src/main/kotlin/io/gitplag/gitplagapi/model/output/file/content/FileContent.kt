package io.gitplag.gitplagapi.model.output.file.content

import com.fasterxml.jackson.annotation.JsonProperty

data class FileContent(
    @JsonProperty(value = "name", required = true)
    val name: String,
    @JsonProperty(value = "content", required = true)
    val content: List<String>
)