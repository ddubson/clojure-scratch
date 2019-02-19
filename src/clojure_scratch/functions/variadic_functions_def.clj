(ns variadic_functions_def)

; Variadic functions are functions that can have an indefinite
; amount of parameters
(defn messenger [greeting & who]                            ; ampersand denotes a variadic variable "who" that contains a sequence of N params
      (println greeting who))

(messenger "hello" "world" "clojure")
; -> hello (world clojure)
