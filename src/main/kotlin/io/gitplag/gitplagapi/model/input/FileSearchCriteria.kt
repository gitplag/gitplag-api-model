package io.gitplag.gitplagapi.model.input

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class FileSearchCriteria(
    @JsonProperty(value = "branch", required = false)
    val branch: String? = null,
    @JsonProperty(value = "fileName", required = false)
    val fileName: String? = null,
    @JsonProperty(value = "student", required = false)
    val student: String? = null
)