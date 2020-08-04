
export class translator {
  static translate(word) {
    let resultantWord = "";
    let result = this.checkForPositionOfY(word) || this.getConsonantCluster(word);
    
    if(word.includes(' ')){
      let words = word.split(" "),res = [];
      words.forEach(word => res.push(this.translate(word)));
      return res.join(" ");
    }
    else if(this.checkForVowelSound(word)){
        resultantWord = word+"ay";
    }
    else if (result){
      resultantWord = word.slice(result.length)+result+"ay";
    } 
    return resultantWord;
  }

  static checkForVowelSound(str){
    var re = /^[aeiou]|^xr|^yt/i;
    return re.test(str);
  }

  static getConsonantCluster(str){ 
    let regex1 = /^[^aeiou]*(qu|h)(r)?|^[^aeiou]/;
    let match1 = str.match(regex1);
    if(match1 != null) 
      return match1[0];
  }

  static checkForPositionOfY(str){
    let regex = /^[^aeiou]{0,2}y/
    let match = str.match(regex);
    if(match!=null)
      return match[0].slice(0,str.indexOf('y'));
  }
}
