(ns repl-playground.util)

(defn sum
  "Stupid sum function"
  [& args]
  (apply + args))

(defn- all-numbers?
  "Check if the `coll` contains only numbers"
  [& args]
  (if (empty? args)
    false
    (empty? (filter #(= false %) (map number? args))))
  )

(defmacro +
  "Stupid macro to make a sum like in real life - usage:
  `somme op1 + op2`
  `op1` and `op2` should be numbers
  "
  [op1 operator op2]
  (if (and
        (= '+ operator)                                     ; check the operator is a +
        (all-numbers? op1 op2))
    `(clojure.core/+ ~op1 ~op2)
    (throw (RuntimeException. "Not a way to call a sum macro - expected [somme operand1 + operand2]\noperand1 and operand2 should be numbers")))
  )


;; for REPL
(comment
  (require' (repl-playground.util))
  (alias 'util 'repl-playground.util)
  (util/sum 1 2 3)
  (util/+ 1 + 4)
  )
