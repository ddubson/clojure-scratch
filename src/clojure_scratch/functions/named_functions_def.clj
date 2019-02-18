(ns clojure-scratch.functions.named-functions-def)

(def messenger1 (fn [msg] (print msg)))                      ; longhand function definition
(defn messenger2 [msg] (print msg))                          ; def+fn shorthand; equiv to above
(messenger2 "Hello, World!")                                 ; Invoke the named function

(defn msger
  ([] (msger "Hello Clojure!"))                             ; no-arg definition
  ([msg] (print msg)))                                      ; one-arg definition

(msger)                                                     ; will print Hello Clojure
(msger "Hello World!")
