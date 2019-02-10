; Control Flow examples
;
; If-Else
; (if boolean-form
;  then-form
;  optional-else-form)
(if true                                                    ; predicate
  println "This is true!!"                                  ; executed if true
  println "This is false!")                                 ; executed if false

(if false                                                   ; predicate
  println "This is true!")                                  ; executed if true
; output is Nil (no else branch)

; If with Do statement
; for multiple statement execution in a branch
(if true                                                    ; predicate
  (do (println "Success!")                                  ; (1) truth stmt
      "Success statement")                                  ; (2) truth stmt
  (do (println "Failure!")                                  ; (1) fail stmt
      "Failure statement"))                                 ; (2) fail stmt

; when statement (if and do combination)
(when true                                                  ; predicate
  (println "Success!")                                      ; (1)
  "Success statement")                                      ; (2)