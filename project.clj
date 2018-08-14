(defproject tools "0.0.1-SNAPSHOT"

  :description "A sample project"
  :url "http://example.org/sample-clojure-project"

  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}

  :min-lein-version "2.0.0"

  :dependencies [[org.clojure/clojure "1.9.0"]]
  :plugins []
  ;; These repositories will be searched for :dependencies and
  ;; :plugins and will also be available to deploy to.
  ;; Add ^:replace (:repositories ^:replace [...]) to only use repositories you
  ;; list below.

;;; Entry Point
  ;; The -main function in this namespace will be run at launch
  ;; (either via `lein run` or from an uberjar). It should be variadic:
  ;;
  ;; (ns my.service.runner
  ;;   (:gen-class))
  ;;
  ;; (defn -main
  ;;   "Application entry point"
  ;;   [& args]
  ;;   (comment Do app initialization here))
  ;;
  ;; This will be AOT compiled by default; to disable this, attach ^:skip-aot
  ;; metadata to the namespace symbol. ^:skip-aot will not disable AOT
  ;; compilation of :main when :aot is :all or contains the main class. It's
  ;; best to be explicit with the :aot key rather than relying on
  ;; auto-compilation of :main. Setting :main to nil is useful when a
  ;; project contains several main functions. nil will produce a jar
  ;; with manifest.mf that lacks `Main-Class' property.
;;  :main my.service.runner
  )

;;; Environment Variables used by Leiningen

;; JAVA_CMD - executable to use for java(1)
;; JVM_OPTS - extra options to pass to the java command
;; DEBUG - increased verbosity
;; LEIN_SILENT - suppress info-level output
;; LEIN_HOME - directory in which to look for user settings
;; LEIN_SNAPSHOTS_IN_RELEASE - allow releases to depend on snapshots
;; LEIN_JVM_OPTS - tweak speed of plugins or fix compatibility with old Java versions
;; LEIN_USE_BOOTCLASSPATH - speed up boot time on JVMs older than 9
;; LEIN_REPL_HOST - interface on which to connect to nREPL server
;; LEIN_REPL_PORT - port on which to start or connect to nREPL server
;; LEIN_OFFLINE - equivalent of :offline? true but works for plugins
;; LEIN_GPG - gpg executable to use for encryption/signing
;; LEIN_NEW_UNIX_NEWLINES - ensure that `lein new` emits '\n' as newlines
;; LEIN_SUPPRESS_USER_LEVEL_REPO_WARNINGS - suppress "repository in user profile" warnings
;; LEIN_FAST_TRAMPOLINE - memoize `java` invocation command to speed up subsequent trampoline launches
;; LEIN_NO_USER_PROFILES - suppress loading of user and system profiles
;; http_proxy - host and port to proxy HTTP connections through
;; http_no_proxy - pipe-separated list of hosts which may be accessed directly
