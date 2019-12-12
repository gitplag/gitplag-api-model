package io.gitplag.gitplagapi.model.output.pullrequest

import com.fasterxml.jackson.annotation.JsonProperty

data class PullRequest(
    @JsonProperty(value = "id", required = true)
    val id: Long,
    @JsonProperty(value = "number", required = true)
    val number: Int,
    @JsonProperty(value = "user", required = true)
    val user: String,
    @JsonProperty(value = "from", required = true)
    val from: String,
    @JsonProperty(value = "to", required = true)
    val to: String
)