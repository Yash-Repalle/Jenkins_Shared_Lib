def call(Map stageParams){
    checkout([
        $class: 'GITSCM'
        
    ])
}