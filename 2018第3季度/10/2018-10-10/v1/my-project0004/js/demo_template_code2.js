

window.onload=function(){

var vue = new Vue({
  el : '#app-100',
  data : {
    goodsObj : goodsObj,
    allChecked : false
  },
  ready : function() {

  },
  methods : {
    // 全部商品全选
    chooseAllGoods : function() {
      var flag = true;
      if ( this.allChecked ) {
        flag = false;
      }
      for ( var i = 0, len = this.goodsObj.length; i < len; i++ ) {
        this.goodsObj[i]['checked'] = flag;
        var list = this.goodsObj[i]['list'];
        for ( var k = 0, len1 = list.length; k < len1; k++ ) {
          list[k]['checked'] = flag;
        }
      }
      this.allChecked = !this.allChecked;
    },

    // 每个店铺全选
    chooseShopGoods : function( index) {
      var list = this.goodsObj[index]['list'],
        len = list.length;
      if ( this.goodsObj[index]['checked'] ) {
        for (var i = 0; i < len; i++ ) {
          list[i]['checked'] = false;
        }
      } else {
        for (var i = 0; i < len; i++ ) {
          list[i]['checked'] = true;
        }
      }
      this.goodsObj[index]['checked'] = !this.goodsObj[index]['checked'];

      // 判断是否选择所有商品的全选
      this.isChooseAll();
    },

    // 单个选择
    choose : function( index1, index) {
      var list = this.goodsObj[index1]['list'],
        len = list.length;
      if ( list[index]['checked'] ) {
        this.goodsObj[index1]['checked'] = false;
        this.allChecked = false;
        list[index]['checked'] = !list[index]['checked'];
      } else {
        list[index]['checked'] = !list[index]['checked'];

        // 判断是否选择当前店铺的全选
        var flag = true;
        for (var i = 0; i < len; i++ ) {
          if ( list[i]['checked'] == false ) {
            flag = false;
            break;
          }
        }
        flag == true ? this.goodsObj[index1]['checked'] = true : this.goodsObj[index1]['checked'] = false;
      }

      // 判断是否选择所有商品的全选
      this.isChooseAll();
    },

    // 判断是否选择所有商品的全选
    isChooseAll : function() {
      var flag1 = true;
      for ( var i = 0, len = this.goodsObj.length; i < len; i++ ) {
        if ( this.goodsObj[i]['checked'] == false ) {
          flag1 = false;
          break;
        }
      }
      flag1 == true ? this.allChecked = true : this.allChecked = false;
    },

  }
})

	
}
