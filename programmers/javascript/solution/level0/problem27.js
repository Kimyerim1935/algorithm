function solution(n, k) {
    const lambPrice = 12000 * n;
    const serviceCount = Math.floor(n / 10);
    const drinkPrice = 2000 * (k - serviceCount);

    return lambPrice + drinkPrice;
}
