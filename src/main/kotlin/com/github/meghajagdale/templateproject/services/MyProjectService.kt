package com.github.meghajagdale.templateproject.services

import com.github.meghajagdale.templateproject.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
