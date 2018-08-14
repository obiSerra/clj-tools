(ns tools.macros)

(comment  (throw (IllegalArgumentException.  "if-let-> requires a number of arguments divisible by 3")))

(defmacro if-let->
  "Recursivelly creates a series of nested if-let, using the first, third, etc.. params as bindings, the second, forth, etc.. as :else condition.
  Each binding created can be used in any following step; if all bindings are valid, the last step returns the second element of the binding.
  "
  [& values]
  `(if-let ~(first values)
     ~(if (= (count values) 2)
        (second (first values))
        (cons `tools.macros/if-let-> (nthrest values 2)))
     ~(second values)))
