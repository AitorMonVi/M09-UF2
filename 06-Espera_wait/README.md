# PREGUNTA 1
## Per què s'atura l'execució al cap d'un temps?

L'execució al final s'atura perquè els assistents que ja tenen reserva demanen una nova, llavors es queden esperant i com que la resta encara que cancel·len no quedaran places disponibles al final arribarà un moment que tots esperin per places disponibles infinitament.

# PREGUNTA 2
## Què passaria si en lloc de una probabilitat de 50%-50% fora de 70%(ferReserva)-30%(cancel·lar)? I si foren al revés les probabilitats? -> Mostra la porcio de codi modificada i la sortida resultant en cada un dels 2 casos

~~~~
if (random.nextInt(100)>=49)
~~~~

Quan executem amb proporcions 70%(ferReserva)-30%(cancel·lar) podem veure que arribem al mateix resultat però en aquest cas més ràpidament.

~~~~
Assistent-0 ha fet una reserva. Places disponibles: 4
Assistent-9 ha fet una reserva. Places disponibles: 3
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-7 ha fet una reserva. Places disponibles: 2
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 ha fet una reserva. Places disponibles: 1
Assistent-4 ha fet una reserva. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
~~~~

En cas de fer-ho un altre vegada amb 30%(ferReserva)-70%(cancel·lar) podem veure com tarda molt més en quedar-se en un estat d'espera infinit.

~~~~
Assistent-0 ha fet una reserva. Places disponibles: 4
Assistent-9 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 4
Assistent-8 ha fet una reserva. Places disponibles: 3
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-5 ha fet una reserva. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-0 ha cancel·lat una reserva. Places disponibles: 3
Assistent-0 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-3 ha fet una reserva. Places disponibles: 2
Assistent-6 ha fet una reserva. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 ha cancel·lat una reserva. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-9 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-9 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-9 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-8 ha cancel·lat una reserva. Places disponibles: 3
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-0 ha fet una reserva. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-6 ha fet una reserva. Places disponibles: 1
Assistent-6 ha cancel·lat una reserva. Places disponibles: 2
Assistent-6 ha cancel·lat una reserva. Places disponibles: 3
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-4 ha fet una reserva. Places disponibles: 2
Assistent-3 ha cancel·lat una reserva. Places disponibles: 3
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 3
Assistent-9 ha fet una reserva. Places disponibles: 2
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 ha fet una reserva. Places disponibles: 1
Assistent-9 ha cancel·lat una reserva. Places disponibles: 2
Assistent-9 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-9 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 ha fet una reserva. Places disponibles: 1
Assistent-0 ha fet una reserva. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-6 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-6 ha fet una reserva. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 ha cancel·lat una reserva. Places disponibles: 1
Assistent-4 ha cancel·lat una reserva. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 ha fet una reserva. Places disponibles: 1
Assistent-2 ha fet una reserva. Places disponibles: 0
Assistent-4 ha cancel·lat una reserva. Places disponibles: 1
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-2 ha cancel·lat una reserva. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 2
Assistent-1 ha fet una reserva. Places disponibles: 1
Assistent-3 ha fet una reserva. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-2 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 ha cancel·lat una reserva. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-8 ha fet una reserva. Places disponibles: 0
Assistent-1 ha cancel·lat una reserva. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-1 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 ha fet una reserva. Places disponibles: 0
Assistent-8 ha cancel·lat una reserva. Places disponibles: 1
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-8 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 ha fet una reserva. Places disponibles: 0
Assistent-3 ha cancel·lat una reserva. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-2 ha fet una reserva. Places disponibles: 0
Assistent-7 ha cancel·lat una reserva. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 ha fet una reserva. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-4 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-7 ha cancel·lat una reserva. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 ha fet una reserva. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 0
Assistent-3 ha cancel·lat una reserva. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-7 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-3 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
Assistent-5 ha cancel·lat una reserva. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 no ha pogut cancel·lar una reserva inexistent. Places disponibles: 1
Assistent-5 ha fet una reserva. Places disponibles: 0
~~~~

# PREGUNTA 3
## Perquè creus que fa falta la llista i no valdria només amb una variable sencera de reserves?

Perquè hi hauria falta d'informació al moment de reconèixer un assistent, ja que no coneixem absolutament res de l'assistent i només tenim números sencers de guia.