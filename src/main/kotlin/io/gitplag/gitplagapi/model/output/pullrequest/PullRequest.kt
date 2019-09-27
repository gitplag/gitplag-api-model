package io.gitplag.gitplagapi.model.output.pullrequest

data class PullRequest(
        val id: Long,
        val number: Int,
        val user: String,
        val from: String,
        val to: String
)