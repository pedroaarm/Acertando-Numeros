(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(defn incrementa [x]
  (+ x 1) )


(defn menu1 []
  (println "1 - Jogarr: ")
  (let [opc (read-line)]
    (parse-int opc)
    )
  )

(defn sorteion []
 (rand-int 100))

(defn play []
  (let [sort (sorteion)]
   (def cont (atom 0))
  (println sort)
  (def var (atom 1))
       (while (<= @var 1)
         (swap! cont inc)
       (do
        (println "Digite um numero: ")
          (let [numero (read-line)]
          (let [ver ( parse-int numero)]
           (if (= ver sort)
            (do (println "Acertou depois de " @cont "tentativas")
              (reset! var 2)
                )
                (if (< ver sort)
                  (println "Errou, o numero e maior")
                  (println "Errou, o numero e menor"))))
        )))))


(defn main []
  (def observa (atom 10))
  (while (not (= @observa 0))
    (do
    (reset! observa  (menu1))
    (case @observa 1 (play)
      case @observa 0
                   (do
                     (reset! observa  0)
                     (println "saindo..."))

                  (println "opcao invalida")))))


(main)



