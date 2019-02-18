(ns clojure-scratch.functions.anon-functions-def)

;;  params    body
;;  ---       ---
(fn [message] (print message))
;; --> anonymous function

;; Anonymous function with immediate invocation
((fn [msg] (print msg))
  "Hello, World!"
  )