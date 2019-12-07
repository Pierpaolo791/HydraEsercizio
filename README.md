# HydraEsercizio
 Guerrieri e 1 Guaritore cercano di Sconfiggere un Hydra a 6 teste
	- I guerrieri hanno a disposizione 3 spade diverse, del fuoco e del tuono.
	- Ogni testa è debole a una sola delle 3 spade 
	- L'Hydra viene uccisa sconfiggendo tutte le 6 teste, una alla volta.
	- Ad ogni tentativo, ciascun guerriero:
		○ Seleziona un arma a caso tra le tre disponibili
		○ Attacca l'Hydra:
			§ Se la testa dell'Hydra corrente è debole all'arma, la testa viene sconfitta.
			§ Altrimenti, il guerriero viene sconfitto e sviene (wait()), in attesa di essere curato
		○ Se tutte le teste sono state sconfitte, il guerriero può andare in birreria. 
		○ Altrimenti, attende 100ms e continua con il prossimo tentativo. 
	- Il guaritore:
		○ Attende 1000ms 
		○ Cura tutti i guerrieri svenuti (notifyAll())
Se l'Hydra è stato sconfitto, torna a casa 
