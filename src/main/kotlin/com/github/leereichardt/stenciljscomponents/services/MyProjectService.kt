package com.github.leereichardt.stenciljscomponents.services

import com.github.leereichardt.stenciljscomponents.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
