
// You have n fair coins and you flip them all at the same time. Any that come up tails you set aside. 
// The ones that come up heads you flip again. How many rounds do you expect to play before only one coin remains?

// Write a function that, given n, returns the number of rounds you'd expect to play until one coin remains.

var numRounds = flipFunction(32);

function flipFunction(numCoins) {

    let rounds = 0;

    if (numCoins <= 1) {
        return 0;
    } else {
        while (numCoins > 1) {
            //flip (assume half tails)
            numCoins = numCoins / 2;
            rounds++;
        }

        console.log(rounds);
        return rounds;
    }
}



// so we set aside 50 percent of flips theoretically
// meaning if we have 2 coins....we have 1 rounds 
// if we have 4 coins we have 2 rounds 
// so we are just cutting in half over and over...the genuine stat answer is that we would have an endless
// but in this case we have to pick...so if we have odd numbers -- 