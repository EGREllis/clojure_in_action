;; Addition
(+ 1 2)

;; Function definition
(defn my-addition [operand1 operand2] (+ operand1 operand2))


;; Invoke new function
(my-addition 1 2)

;; Print Hello World!
(println "Hello World")

;; Hashmap example of users
(def users {"kyle" {:password "secretk" :number-pets 2}
		"siva"		{:password "secrets"	:number-pets 4}
		"rob"		{:password "secretr"	:number-pets 6}
		"george"	{:password "secretg"	:number-pets 8}})

;; Login function
(defn check-login [username password]
	(let [actual-password	((users username) :password)]
		(= actual-password password)))

;; Example usage:
(check-login "siva" "secrets")
(check-login "amit" "blah")

;; Build in documentation system
(doc +)
(doc doc)

;; Find-doc searched doc for a string
(find-doc "lazy")

;; Prefix notation
(cond
	(> x 0)	(println "greater!")
	(= x 0) (println "zero!")
	:default (println "neither!"))

;; Whitespace
(+ 1 2 3 4 5)
(+ 1, 2, 3, 4, 5)

;; Define a map
(def a-map {:a 1 :b 2 :c 3})

;; Unusual comment
(comment (defn this-is-not-working [x y] (+ x y)))

;; Functions
(defn addition-function [x y]
	(+ x y))

;; Variable arity (extra arguments kept in the 'more'
(defn addition-function [x y & more]
	(+ x y more))

;; Consider the function...
(defn average-pets []
	(/	(apply + (map :number-pets (vals users))) (count users)))

;; Consider an alternative implementation:
(defn average-pets []
	(let	[user-data	(vals users)
		 number-pets	(map :number-pets user-data)
		 total		(apply + number-pets)]
	 (/ total (count users))))

;; Continue from page 37 
