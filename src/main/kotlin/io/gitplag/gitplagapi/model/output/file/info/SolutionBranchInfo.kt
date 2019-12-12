package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonProperty

data class SolutionBranchInfo(
    @JsonProperty(value = "sourceBranch", required = true)
    val sourceBranch: String,
    @JsonProperty(value = "solutions", required = true)
    val solutions: Collection<SolutionInfo>
)