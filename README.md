# Scala JS ScalaTest Issue

This project is a demo of ScalaTest not working with ScalaJS.

```
> sbt
[info] Loading settings from idea.sbt ...
[info] Loading global plugins from /Users/joangoyeau/.sbt/1.0/plugins
[info] Updating {file:/Users/joangoyeau/.sbt/1.0/plugins/}global-plugins...
[info] Done updating.
[info] Loading settings from plugins.sbt ...
[info] Loading project definition from /Users/joangoyeau/Code/test/project
[info] Updating {file:/Users/joangoyeau/Code/test/project/}test-build...
[info] Done updating.
[info] Loading settings from build.sbt ...
[info] Set current project to test (in build file:/Users/joangoyeau/Code/test/)
[info] sbt server started at 127.0.0.1:5565
sbt:test> test
[info] Updating {file:/Users/joangoyeau/Code/test/}testJVM...
[info] Updating {file:/Users/joangoyeau/Code/test/}testJS...
[info] downloading https://repo1.maven.org/maven2/org/scala-js/scalajs-library_2.12/0.6.21/scalajs-library_2.12-0.6.21.jar ...
[info] downloading https://repo1.maven.org/maven2/org/scalactic/scalactic_2.12/3.0.4/scalactic_2.12-3.0.4.jar ...
[info] downloading https://repo1.maven.org/maven2/org/scalatest/scalatest_2.12/3.0.4/scalatest_2.12-3.0.4.jar ...
[info] downloading https://repo1.maven.org/maven2/org/scala-js/scalajs-test-interface_2.12/0.6.21/scalajs-test-interface_2.12-0.6.21.jar ...
[info] 	[SUCCESSFUL ] org.scala-js#scalajs-test-interface_2.12;0.6.21!scalajs-test-interface_2.12.jar (435ms)
[info] 	[SUCCESSFUL ] org.scalactic#scalactic_2.12;3.0.4!scalactic_2.12.jar(bundle) (617ms)
[info] downloading https://repo1.maven.org/maven2/org/scala-js/scalajs-compiler_2.12.4/0.6.21/scalajs-compiler_2.12.4-0.6.21.jar ...
[info] 	[SUCCESSFUL ] org.scala-js#scalajs-compiler_2.12.4;0.6.21!scalajs-compiler_2.12.4.jar (720ms)
[info] 	[SUCCESSFUL ] org.scalatest#scalatest_2.12;3.0.4!scalatest_2.12.jar(bundle) (3397ms)
[info] 	[SUCCESSFUL ] org.scala-js#scalajs-library_2.12;0.6.21!scalajs-library_2.12.jar (3471ms)
[info] Done updating.
[info] Updating {file:/Users/joangoyeau/Code/test/}test...
[info] Done updating.
[info] Done updating.
[info] Fast optimizing /Users/joangoyeau/Code/test/test/.js/target/scala-2.12/test-test-fastopt.js
[info] Fast optimizing /Users/joangoyeau/Code/test/test/.jvm/target/scala-2.12/test-test-fastopt.js
[error] dyld: Library not loaded: /usr/local/opt/icu4c/lib/libicui18n.58.dylib
[error]   Referenced from: /usr/local/bin/node
[error]   Reason: image not found
[error] java.io.IOException: Stream closed
[error] 	at java.lang.ProcessBuilder$NullOutputStream.write(ProcessBuilder.java:433)
[error] 	at java.io.OutputStream.write(OutputStream.java:116)
[error] 	at java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:82)
[error] 	at java.io.BufferedOutputStream.flush(BufferedOutputStream.java:140)
[error] 	at java.io.FilterOutputStream.close(FilterOutputStream.java:158)
[error] 	at org.scalajs.jsenv.ExternalJSEnv$AbstractExtRunner.pipeVMData(ExternalJSEnv.scala:97)
[error] 	at org.scalajs.jsenv.ExternalJSEnv$ExtRunner.run(ExternalJSEnv.scala:167)
[error] 	at org.scalajs.sbtplugin.FrameworkDetector.detect(FrameworkDetector.scala:71)
[error] 	at org.scalajs.sbtplugin.ScalaJSPluginInternal$.$anonfun$scalaJSTestFrameworkSettings$1(ScalaJSPluginInternal.scala:1004)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:42)
[error] 	at sbt.std.Transform$$anon$4.work(System.scala:64)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:257)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] 	at sbt.Execute.work(Execute.scala:266)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:257)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:167)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:32)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
[error] 	at java.lang.Thread.run(Thread.java:745)
[error] org.scalajs.jsenv.ExternalJSEnv$NonZeroExitException: Node.js exited with code 134
[error] 	at org.scalajs.jsenv.ExternalJSEnv$AbstractExtRunner.waitForVM(ExternalJSEnv.scala:119)
[error] 	at org.scalajs.jsenv.ExternalJSEnv$ExtRunner.run(ExternalJSEnv.scala:168)
[error] 	at org.scalajs.sbtplugin.FrameworkDetector.detect(FrameworkDetector.scala:71)
[error] 	at org.scalajs.sbtplugin.ScalaJSPluginInternal$.$anonfun$scalaJSTestFrameworkSettings$1(ScalaJSPluginInternal.scala:1004)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:42)
[error] 	at sbt.std.Transform$$anon$4.work(System.scala:64)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:257)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] 	at sbt.Execute.work(Execute.scala:266)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:257)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:167)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:32)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
[error] 	at java.lang.Thread.run(Thread.java:745)
[error] (testJS/test:loadedTestFrameworks) java.io.IOException: Stream closed
[error] (testJVM/test:loadedTestFrameworks) org.scalajs.jsenv.ExternalJSEnv$NonZeroExitException: Node.js exited with code 134
[error] Total time: 24 s, completed 04-Dec-2017 16:32:2
```
