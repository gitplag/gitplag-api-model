package io.gitplag.gitplagapi.model.output.file.info

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class RepositoryFilesInfo(
    @JsonProperty(value = "baseBranches", required = true)
    val baseBranches: Collection<BaseBranchInfo>,
    @JsonProperty(value = "solutionBranches", required = true)
    val solutionBranches: Collection<SolutionBranchInfo>
)