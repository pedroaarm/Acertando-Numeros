(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(defn incrementa [x]
  (+ x 1) )


(defn menu1 []
  (println "1 - Jogar\n 2 - Ranking\n 3 - Cadastrar Jogados\n 4 - sair: ")
  (let [opc (read-line)]
    (parse-int opc)
    )
  )

(defn sorteion []
 (rand-int 100))

(defn main []
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
(main)



