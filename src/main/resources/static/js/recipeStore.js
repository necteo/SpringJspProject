const { defineStore } = Pinia
// replyStore
const useRecipeStore = defineStore('recipe', {
	// state : 공통 사용 변수 , props
	state: () => ({
		list: [],
		curpage: 1,
		totalpage: 0,
		startPage: 0,
		endPage: 0,
		detail: {
			vo: {},
			tList: [],
			iList: []
		}
	}),
	getters: {
		range: (state) => {
			const arr = []
			for (let i = state.startPage; i <= state.endPage; i++) {
				arr.push(i)
			}
			return arr
		}
	},
	actions: {
		// default 매개변수 => recipeListData() recipeListData(2)
		async recipeListData() {
			const res = await api.get('/recipe/list_vue', {
				params: {
					page: this.curpage
				}
			})
			console.log(res.data)
			this.setPageData(res.data)
		},
		// 
		setPageData({ list, curpage, totalpage, startPage, endPage }) {
			this.list = list
			this.curpage = curpage
			this.totalpage = totalpage
			this.startPage = startPage
			this.endPage = endPage
		},
		// prev / next / pageChange
		movePage(page) {
			this.curpage = page
			this.recipeListData()
		},
		// 상세보기
		async recipeDetailData(no) {
			const res = await api.get(`/recipe/detail_vue?no=${no}`)
			console.log(res.data)
			this.detail = res.data
		}
	}
})