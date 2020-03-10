package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class SolutionBranchInfo(
    @JsonProperty(value = "sourceBranch", required = true)
    val sourceBranch: String,
    @JsonProperty(value = "solutions", required = true)
    val solutions: Collection<SolutionInfo>
)