plugins {
    java
    //application
    //war
}

//获取所有源文件的全路径
task("getSrcName", {
    inputs.dir("src")
    outputs.files("info.txt")

    doFirst {
        var srcdir = fileTree("src")
        var infotxt = file("info.txt")
        infotxt.writeText("")
        srcdir.forEach {
            if (it.isFile) {
                Thread.sleep(1000)
                infotxt.appendText(it.absolutePath)
                infotxt.appendText("\r\n")
            }

        }
    }
})

//打印所有的gradle任务
/*task("println", {
    project.properties.forEach { t, any ->
        println("$t: $any")
    }
})*/


/*task("opendoor", {
    doFirst {
        println("开门")
    }
})

task("putelephant", {
    doFirst {
        println("放大象")
    }
}).dependsOn("opendoor")

task("closedoor", {
    doFirst {
        println("关门")
    }
}).dependsOn("putelephant")*/

//任务集
/*tasks{
    "eat"{

    }

    "buy"{

    }
}*/




