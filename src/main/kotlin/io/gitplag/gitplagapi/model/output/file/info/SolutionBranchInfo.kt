package io.gitplag.gitplagapi.model.output.file.info

data class SolutionBranchInfo(
        val sourceBranch: String,
        val solutions: Collection<SolutionInfo>
)