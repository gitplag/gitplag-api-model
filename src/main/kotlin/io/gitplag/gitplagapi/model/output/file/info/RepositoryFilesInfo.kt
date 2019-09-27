package io.gitplag.gitplagapi.model.output.file.info

data class RepositoryFilesInfo(
        val baseBranches: Collection<BaseBranchInfo>,
        val solutionBranches: Collection<SolutionBranchInfo>
)