var sum = 0, num = 0, counter = 0;
do
{
    counter++;
    sum += num;
    num = parseFloat(prompt());
}while(num >= 0);

document.write(sum / (counter - 1));