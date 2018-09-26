
new Vue({
    el: '#app',
    data: {
        newPerson: {
            name: '',
            age: 0,
            sex: 'Male'
        },
        people: [{
            name: 'Jack',
            age: 30,
            sex: 'Male'
        }, {
            name: 'Bill',
            age: 26,
            sex: 'Male'
        }, {
            name: 'Tracy',
            age: 22,
            sex: 'Female'
        }, {
            name: 'Chris',
            age: 36,
            sex: 'Male'
        }]
    },
    methods:{
        createPerson: function(){
            this.people.push(this.newPerson);
            // 添加完newPerson对象后，重置newPerson对象
            this.newPerson = {name: '', age: 0, sex: 'Male'}
        },
        deletePerson: function(index){
            // 删一个数组元素
            this.people.splice(index,1);
        }
    }
})
