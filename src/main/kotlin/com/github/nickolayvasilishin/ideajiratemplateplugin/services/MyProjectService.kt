package com.github.nickolayvasilishin.ideajiratemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.nickolayvasilishin.ideajiratemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
