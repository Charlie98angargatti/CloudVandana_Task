function reverseWords(sentence) {
   
    const words = sentence.split(' ');

    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const inputSen = "CloudVandana is a Digital Transformation Partner";
const reversedSen = reverseWords(inputSen);
console.log(reversedSen);